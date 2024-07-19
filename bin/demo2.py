
# # # # # # import pandas as pd

# # # # # # import matplotlib.pyplot as plt


# # # # # # data = {

# # # # # # 'Name': ['John', 'Sammy', 'Joe'], 'Age': [45, 38, 90], 'Height (in cm)': [150, 180, 160]

# # # # # # }

# # # # # # df = pd. DataFrame (data)


# # # # # # df.plot(x='Name', y=['Age', 'Height (in cm)'], kind='bar')

# # # # # # plt.title('Bar Chart: Age and Height')

# # # # # # plt.xlabel('Name')

# # # # # # plt.ylabel('Values')

# # # # # # plt.show()

# # # # # #HISTOGRAM

# # # # # import matplotlib.pyplot as plt

# # # # # import numpy as np


# # # # # data = np.random.randn(1000)

# # # # # plt.hist (data, bins=30, color='skyblue', edgecolor='black') 
# # # # # plt.xlabel('Values') 
# # # # # plt.ylabel('Frequency') 
# # # # # plt.title('Basic Histogram')

# # # # # plt.show()

# # # # import pandas as pd

# # # # player_list = [['M.S.Dhoni', 36, 75, 5428000],
# # # # 			['A.B.D Villers', 38, 74, 3428000],
# # # # 			['V.Kohli', 31, 70, 8428000],
# # # # 			['S.Smith', 34, 80, 4428000],
# # # # 			['C.Gayle', 40, 100, 4528000],
# # # # 			['J.Root', 33, 72, 7028000],
# # # # 			['K.Peterson', 42, 85, 2528000]]

# # # # df = pd.DataFrame(player_list, columns=['Name', 'Age', 'Weight', 'Salary'])
# # # # df 


# import pandas as pd

# df = pd.DataFrame({'color': ['red', 'green', 'blue', 'red']})

# df1 = pd.get_dummies(df, columns=['color'], prefix='', prefix_sep='')

# print(df1)

# # import pandas as pd

# # df = pd.DataFrame({'animal': ['cat', 'dog', 'bird', 'cat']})

# # print(f"Before Encoding the Data:\n\n{df}\n")
# # animal_map = {'cat': 0, 'dog': 1, 'bird': 2}
# # df['animal'] = df['animal'].map(animal_map)
# # df['animal'] = df['animal'].apply(lambda x: format(x, 'b'))
# # print(f"After Encoding the Data:\n\n{df}\n")

# # from sklearn.preprocessing import LabelEncoder

# # df = pd.DataFrame({'color': ['red', 'green', 'blue', 'red', 'green']}) 
# # print(f"Before Encoding the Data:\n\n{df}\n")

# # le = LabelEncoder()

# # df['color_label'] = le.fit_transform(df['color'])

# from sklearn.preprocessing import LabelEncoder

# df = pd.DataFrame({'color': ['red', 'green', 'blue', 'red', 'green']}) 
# print(f"Before Encoding the Data:\n\n{df}\n")

# le = LabelEncoder()

# df['color_label'] = le.fit_transform(df['color'])

# print(f"after encoding the data;\n\n {df}\n")


import pandas as pd

import numpy as np

import matplotlib.pyplot as plt

import seaborn as sns

from sklearn.preprocessing import StandardScaler, MinMaxScaler

pd.set_option("display.max_columns", None)

pd.set_option("display.max_rows", 200)

df = pd.read_csv('fifa.csv', index_col=0)

print(f"There are {df.shape[0]} rows and {df.shape[1]} columns in the dataframe.")

df["Acceleration"].hist(bins=20)

plt.title("Acceleration before transformation")

plt.show()