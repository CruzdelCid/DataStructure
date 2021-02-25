from flask import Flask
from linked_list import Cancion, Linked


app = Flask(__name__)


@app.route('/add_song/<string:n>', methods=['GET'])
def add():
    pass


if __name__ == "__main__": 
    app.run(host = "0.0.0.0", port = 5000, debug = True)