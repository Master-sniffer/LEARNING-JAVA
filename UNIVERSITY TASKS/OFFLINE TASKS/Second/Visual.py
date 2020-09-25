import plotly.graph_objects as go # импортируем график
import numpy as np # и нампай
from pathlib import Path # это нужно, чтобы питон прочел файл, который будет находиться в том же каталоге
print ("\nHello, User!\n")
x=np.array([])
y=np.array([])
data_folder = Path("texta.txt")
with open (data_folder, "r") as f:
    for k in f:
        #print(x)
        x=np.append(x,k)

k=0
for i in range(len(x)):
    y=np.append(y,k)
    k+=5

fig = go.Figure(data=go.Scatter(x=x, y=y))
fig.show()
