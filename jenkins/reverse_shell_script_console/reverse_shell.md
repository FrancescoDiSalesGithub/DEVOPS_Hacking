# Reverse shell on jenkins using groovy script console

## Introduction

In this pentesting we are doing a pentest against a jenkins server. In this pentest we are using a docker network in which there are two containers: the attacker using a parrot container and the victim using a jenkins container. The goal of this pentest is to obtain a reverse shell in the jenkins container.

## Enumeration

In the docker network, we have two hosts :
* 172.18.0.2 
* 172.18.0.3

The first one is the attacker using a parrot container, the second one is the jenkins server. Doing a port scanning we have the following outcome:
![](nmapvic)

let's check the server on port 8080:
![](loginscreen)

for the credentials, we are going to try with the default credentials admin:admin
![](provacredenzialidefualtjenkins)

We have got the access to jenkins:
![](Loginsuccess)

Now we have to check if the script page is accessible, by writing as url: **http://172.18.0.3/script**.
![](schermatascript)

Let's create a bash reverse shell and encoding it in **base64**:
![](revshell)

Let's write the following script in the script web page of Jenkins and click on the blue button:
![](scriptRevshell)

As we run the script we have got the reverse shell:
![shellobtained]
