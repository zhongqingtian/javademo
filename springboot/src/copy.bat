@echo off
set destDir = .\main\java\org\example\thrift\thriftserver
echo %destDir%
IF NOT EXIST destDir (
md destDir
)

COPY .\main\thrift\gen-java\org\example\thrift\thriftserver\*.java destDir