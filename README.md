# Blockchain database usage in an web project using CQRS | Proof of concept

## Introduction

Blockchain is a distributed database that maintains a continuously-growing list of records called blocks secured from tampering and revision. View Wikipedia article [here](https://en.wikipedia.org/wiki/Blockchain_(database))

Onces of Blockchain's properities are:

* Decentralized: By storing data across the network. Every server, from now called node, stores all the information.
* Digital Ledger: Once a record is written in the network, it cannot be reversed (it is not totally true, but we will ignore the outlier cases for now). All records have a previous record dependency.
* Free read: Read a record is free for us. It enable us to decrease the monthly costs servers.
* Fee to write: Write a record has a cost.

With this properties in mind, we want to validate the viability of using a blockchain database for a web projects.

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

The same configuration is used for both countries.

## Toolset

* Java 8
* Spring Boot
