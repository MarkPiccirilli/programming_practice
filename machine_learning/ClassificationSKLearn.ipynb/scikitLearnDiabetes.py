import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import train_test_split
from sklearn.svm import LinearSVC
from sklearn.metrics import accuracy_score

print("scikit-learn tutorial with diabetes data\n\n");

data = pd.read_csv("datasets/diabetes.csv")

print("head")
print(data.head())
print()

print("shape")
print(data.shape)
print()

print("any null?")
print(data.isna().any())
print() 

print("describe")
print(data.describe())
print()

x = data.drop("Outcome", axis = 1)
print("x.columns")
print(x.columns)
print()

y = data["Outcome"]
print("y.head")
print(y.head())
print()

scaler = StandardScaler()
x = x.astype("float64")
x_scaled = scaler.fit_transform(x)
print("x_scaled")
print(x_scaled)
print()

x_train, x_test, y_train, y_test = train_test_split(x_scaled, y, test_size = 0.3)

print("Training features shape", x_train.shape)
print("Training target shape", y_train.shape)
print()

print("Test features shape", x_test.shape)
print("Test target shape", y_test.shape)
print()

clf = LinearSVC(max_iter = 10000)
trainingValues = clf.fit(x_train, y_train)
print("trainingValues")
print(trainingValues)
print()

y_pred = clf.predict(x_test)
print("perdictions")
print(y_pred)
print()

print("actual values")
print(y_test.values)
print()

print("accuracy score")
print(accuracy_score(y_test, y_pred))
