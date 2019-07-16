import sys
from subprocess import call

if len(sys.argv) < 2:
    print("Must Inclued argument")
    sys.exit()

call("./c-billion " + sys.argv[1], shell=True)
