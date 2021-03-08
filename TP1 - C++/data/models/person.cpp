#include "person.hpp"

Person::Person(string id, string name) :
    id(id),
    name(name)
{}

Person::Person(){
    id = ' ';
    name = ' ';
}

Person::~Person(){}

string Person::getId(){
    return id;
}

string Person::getName(){
    return name;
}

void Person::setName(string name){
    this->name = name;
}
