
steps (to run)

clone the code
run the client with defaults java -cp args4j-2.33.jar:. DR
run the client add see help java -cp args4j-2.33.jar:. DR -?
steps (to develop)

download the wsdl and associated xsd files, to a local folder
generate the jax-ws classes wsimport DomesticRemittanceByPartnerService.wsdl -extension
compile the client javac DR.java -classpath args4j-2.33.jar:.
client-certificate

the code makes 2 calls, one with-out 2 way ssl, and one with the 2 way ssl
the repository contains a certificate that is white-listed in the UAT enviornment, this is for easy reference (qg-client.jks)
once the sample code runs, you can replace that with a new jks file with your certificate
do not have more than 1 client certificate in the jks file
