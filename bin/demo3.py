# import pandas as pd
# import numpy as np
# import matplotlib.pyplot as plt
# import seaborn as sns
# from sklearn.preprocessing import StandardScaler, MinMaxScaler

# pd.set_option("display.max_columns", None)

# pd.set_option("display.max_rows", 200)

# df = pd.read_csv('fifa.csv', index_col=0)

# print(f"There are {df.shape[0]} rows and {df.shape[1]} columns in the dataframe.")

# df["Acceleration"].hist(bins=20)

# plt.title("Acceleration before transformation")

# plt.show()

# import pandas as pd
# import numpy as np
# import matplotlib.pyplot as plt
# import seaborn as sns
# from sklearn.preprocessing import StandardScaler, MinMaxScaler

# pd.set_option("display.max_columns", None)
# pd.set_option("display.max_rows", 200)
# df = pd.read_csv("/fifa.csv")
# std_scaler = StandardScaler()
# df["Acceleration_z_std"] = std_scaler.fit_transform(df[["Acceleration"]])
# df["Acceleration_z_std"].hist(bins=20)
# plt.title("Acceleration after standardization")
# plt.show()


# import numpy as np
# from sklearn.linear_model import LinearRegression
# x=np.array([[1,1],[1,2],[2,3],[3,4]])
# y=np.dot(x,np.array([1,2]))+3
# reg=LinearRegression().fit(x,y)
# print(reg.score(x,y),"\n",reg.coef_,"\n",reg.intercept_,"\n",
# reg.predict(np.array([[3,5]])))
# Output:
# 1.0
# [1. 2.]
# 2.9999999999999964
# [16.]
# #Linear Regression  with CSV
import pandas
from sklearn import datasets
diabetes_X=datasets.load_diabetes(return_X_y=False,as_frame=True)
print(diabetes_X.DESCR)