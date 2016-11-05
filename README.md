# Blockchain database usage in an existing project using CQRS | Proof of concept

## Introduction

Blockchain is a distributed database that maintains a continuously-growing list of records called blocks secured from tampering and revision. View Wikipedia article [here](https://en.wikipedia.org/wiki/Blockchain_(database))

Onces of Blockchain's properities are:

* Decentralized: By storing data across the network. Every server, from now called node, stores all the information.
* Digital Ledger: Once a record is written in the network, it cannot be reversed (it is not totally true, but we will ignore the outlier cases for now). All records have a previous record dependency.
* Free read: Read a record is free for us. It enable us to decrease the monthly costs servers.
* Fee to write: Write a record has a cost.

With this properties in mind, we want to validate the viability of using a blockchain database for a web projects.
