import pymysql
from flask import Flask, render_template, request, make_response

app = Flask(__name__)
conn = pymysql.connect(host='localhost', user='root', password='', db='') #db = database name


@app.route("/")
def main():
    return render_template('index.html')

@app.route("/name", methods=['POST'])
def recive_name():
    """add name to database"""

# if request.method == "POST":
#         with conn.cursor() as cursor:
#             username = request.form['name']
#             sqlnamefood = request.form['sqlnamefood']
#             sql = "Insert into `dbrestaurant` (`name`, `food`) values(%s, %s)"
#             cursor.execute(sql, (username, sqlnamefood))
#             conn.commit()
#         return render_template('/success.html')
#     return render_template('/unseccess.html')




if __name__ == "__main__":
    app.debug = True
    app.run(host="0.0.0.0")
