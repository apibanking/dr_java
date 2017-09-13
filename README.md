
# steps (to run)

1. clone the code
1. run the client with VPN java -cp args4j-2.33.jar:. DR -disableClientAuth
1. run the client add see help java -cp args4j-2.33.jar:. DR -?


# steps (to develop)

1. download the wsdl and associated xsd files, to a local folder
1. generate the jax-ws classes wsimport DomesticRemittanceByPartnerService.wsdl -extension
1. compile the client javac DR.java -classpath args4j-2.33.jar:.


# server certificate 
To avoid a certificate chain error, the code uses a local trust store that has the YBL certificate included 

# client-certificate
Use -disableClientAuth to make a VPN call. 
To make a 2-way SSL call, run the command without -disableClientAuth (this may not work if the API is not published to you)

To make a 2-way SSL call the code makes 2 calls, one with-out 2 way ssl, and one with the 2 way ssl
the repository contains a certificate that is white-listed in the UAT enviornment, this is for easy reference (qg-client.jks)
once the sample code runs, you can replace that with a new jks file with your certificate
do not have more than 1 client certificate in the jks file
