import os
import pandas as pd


def match_and_update_excel(caseNameCol=0, screenshotsCol=9, sourceCsv="预选赛测试用例答案(1).xlsx", screenShots="screenshots"):
    """
    0.记得先替换默认参数
    1. 将该文件放到与screenshots文件夹一样的路径下
    2. 运行该程序
    3. 将新的列的文件截图名复制粘贴到旧的csv
    4. 选中旧的这一列右键添加框线
    :param caseNameCol: 从0开始计数，测试用例编号列
    :param screenshotsCol:  截图文件名列
    :return:
    """
    # 获取当前路径A
    current_path = os.getcwd()
    # 构建screenshots文件夹B的路径
    screenshots_folder = os.path.join(current_path, screenShots)
    # 获取screenshots文件夹下所有截图文件名列表
    screenshots_files = os.listdir(screenshots_folder)
    # 提取文件名（去除后缀）
    screenshots_names = [os.path.splitext(file)[0] for file in screenshots_files]

    # 构建excel表C的路径（这里假设它就在当前路径A下，根据实际情况调整）
    excel_path = os.path.join(current_path, sourceCsv)
    # 读取excel表
    df = pd.read_excel(excel_path)
    # 获取测试用例编号列（第一列）的数据
    test_case_numbers = df.iloc[:, caseNameCol].astype(str).tolist()
    # 获取截图文件名所在的第九列数据
    screenshot_column = df.iloc[:, screenshotsCol].astype(str).tolist()

    for index in range(len(test_case_numbers)):
        test_case_number = test_case_numbers[index]
        found_match = False
        for screenshot_name in screenshots_names:
            # 以时间戳开头的文件名中取后面部分和测试用例编号对比
            if screenshot_name.split("_", 1)[1] == test_case_number:
                screenshot_column[index] = screenshot_name + ".png"
                found_match = True
                # break
        if not found_match:
            screenshot_column[index] = ""  # 如果没找到匹配的，设置为空字符串

    df.iloc[:, screenshotsCol] = screenshot_column
    # 获取当前时间戳作为新文件名的一部分（这里简化示例，你可以按更精确的需求调整时间戳获取方式）
    timestamp = pd.Timestamp.now().strftime('%Y%m%d%H%M%S')
    new_excel_name = f"{timestamp}.xlsx"
    new_excel_path = os.path.join(current_path, new_excel_name)
    df.to_excel(new_excel_path, index=False)


if __name__ == '__main__':
    match_and_update_excel()

