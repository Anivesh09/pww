# import pandas as pd
# data = {
#     "Name": ["John", "Alice", "Bob"],
#     "Age": [25, 30, 35],
#     "City": ["New York", "London", "Paris"],
# }
# df = pd.DataFrame(data)
# print(df)


# import pandas as pd

# age = [['Aman', 95.5, "Male"], ['Sunny', 65.7, "Female"],
# 	['Monty', 85.1, "Male"], ['toni', 75.4, "Male"]]

# df = pd.DataFrame(age, columns=['Name', 'Marks', 'Gender'])
# print(df)


# # import pandas as pd
# import pandas as pd
 
# # import numpy as np
# import numpy as np
 
# # simple array
# data = np.array(['g','e','e','k','s'])
 
# ser = pd.Series(data)
# print(ser)

# import pandas as pd
# import matplotlib.pyplot as plt
# Stock_Market = {'Year' :
#                 [2017,2017,2017,2017,2017,2017,2017,2017,2017,2017,2017,2017,2016,2016,2016,2016,2016,2016,2016,2016,2016,2016,2016,2016],
#                 'Month': [12,11,10,9,8,7,6,5,4,3,2,1,12,11,10,9,8,7,6,5,4,3,2,1,],
#                 'Interest_Rate':
#                 [2.75,2.5,2.5,2.5,2.5,2.5,2.5,2.25,2.25,2.25,2,2,2,1.75,1.75,1.75,1.75,1.75,1.75,1.75,1.75,1.75,1.75,1.75],
#                 'Unemployment_Rate':
#                 [5.3,5.3,5.3,5.3,5.4,5.6,5.5,5.5,5.5,5.6,5.7,5.9,6,5.9,5.8,6.1,6.2,6.1,6.1,6.1,5.9,6.2,6.2,6.1],
#                 'Stock_Index_Price':
#                 [1464,1394,1357,1293,1256,1254,1234,1195,1159,1167,1130,1075,1047,965,943,958,971,949,884,866,876,822,704,719]
#                }
# df = pd. DataFrame(Stock_Market, columns=['Year', 'Month', 'Interest_Rate', 'Unemployment_Rate','Stock_Index_Price'])

# plt.scatter (df['Interest_Rate'], df ['Stock_Index_Price'], color='red')

# plt.title('Stock Index Price Vs Interest Rate', fontsize=14)

# plt.xlabel('Interest Rate', fontsize=14)

# plt.ylabel('Stock Index Price', fontsize=14)

# plt.grid(True)

# plt.show()

#LINE GRAPH

import pandas as pd

import matplotlib.pyplot as plt


data = {

'Columnl': [1, 2, 3, 4, 5 ], 'Column2': [10, 15, 12, 18, 20]
}

df = pd. DataFrame(data)


ax = df.plot.line(x='Columnl', y='Column2', color='blue', label='Line Plot')


plt.title('Line Plot: Column1 vs. Column2')

plt.xlabel('Column1')

plt.ylabel('Column2')


plt.show()