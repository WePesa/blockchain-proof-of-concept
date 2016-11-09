# Blockchain database usage in an web project using CQRS | Proof of concept

## Introduction

Blockchain is a distributed database that maintains a continuously-growing list of records called blocks secured from tampering and revision. View Wikipedia article [here](https://en.wikipedia.org/wiki/Blockchain_(database))

Onces of Blockchain's properities are:

* Decentralized: By storing data across the network. Every server, from now called node, stores all the information.
* Digital Ledger: Once a record is written in the network, it cannot be reversed (it is not totally true, but we will ignore the outlier cases for now). All records have a previous record dependency.
* Free read: Read a record is free for us. It enable us to decrease the monthly costs servers.
* Fee to write: Write a record has a cost.

With this properties in mind, we want to validate the viability of using a blockchain database for a web projects.

At the same time, there are some blockchains that implements the smart contract feature (we will use just blockchains with that feature).  
An [Smart Contract](https://en.wikipedia.org/wiki/Smart_contract) is a protocol on top of the blockchain that, when the blockchain has an specific state, the protocol is executed.  (PENDING TO REVIEW)  
The smart contract feature enables us to use blockchain as a service, with their own reponsability (a kind of Bounded Context in DDD).

## Goals

* Fast data propagation between continents
* Write data at Europe and Read at North America
* Extract cost metrics
* Extract deploy time

## User stories

* As a user, I want to publish a post
* As a user, I want to view a post
* As a user, I want to view all posts

## Amazon Web Services

To setup the same environment used for this experiment, the next machines will be needed:

Ireland:
* 2x t2.micro

Oregon:
* 2x t2.micro

The same configuration is used for both regions.

## Experiments

The goals are reflected as experiments. For more details, view the wiki.

## Toolset

* Java 8
* [Spring Boot](https://spring.io/)
* [Parity](https://ethcore.io/parity.html)

## Which blockchain?

### Ethereum

Ethereum is a public blockchain, featuring smart contract functionality.

[Wikipedia entry](https://en.wikipedia.org/wiki/Ethereum)  
[Official webside](https://www.ethereum.org/)  
[GitHub](https://github.com/ethereum)  

### Hyperledger fabric

Hyperledger is a cross-industry collaborative effort, started by the Linux Foundation, to support blockchain-based distributed ledgers.

One of the projects is Fabric.
The fabric is an implementation of blockchain technology that is intended as a foundation for developing blockchain applications or solutions. It offers a modular architecture allowing components, such as consensus and membership services, to be plug-and-play. It leverages container technology to host smart contracts called “chaincode” that comprise the application logic of the system.

[Wikipedia entry](https://en.wikipedia.org/wiki/Hyperledger)  
[Official webside](https://www.hyperledger.org/)  
[Github](https://github.com/hyperledger/fabric)  
