import pandas as pd
import pandas_ml as pdml

dataframe= pd.read_csv("datasets/diabetes.csv")

modelframe = pdml.ModelFrame(dataframe.to_dict())

print("mf.head()")
print(modelframe.head())
print()

print("mf.shape")
print(modelframe.shape)
print()

print("is any null?")
print(modelframe.isna().any())
print()

print("describe")
print(modelframe.describe())
print()

print("has target")
print(modelframe.has_target())
print()

modelframe.target_name = "Outcome"

print("has target after setting target")
print(modelframe.has_target())
print()

print("target.head")
print(modelframe.target.head())
print()

print("data.head")
print(modelframe.data.head())
print()

modelframe.data = modelframe.data.preprocessing.scale();
