/*We want to calculate the total marks of each student of a class in Physics,Chemistry and Mathematics and the average marks of the class. 
The number of students in the class are entered by the user. Create a class named Marks with data members for roll number, name and marks. 
Create three other classes inheriting the Marks class, namely Physics, Chemistry and Mathematics, which are used to define marks in individual subject of each student. 
Roll number of each student will be generated automatically.*/


#include<iostream>
#include<string.h>
using namespace std;
class Marks
{
protected:
    int roll;
    char name[20];
public:
    Marks()
    {
        roll=0;
        strcpy(name,"");
    }
    Marks(int r,char n[])
    {
        roll=r;
        strcpy(name,n);
    }
    void display()
    {
        cout<<"Roll no. : "<<roll<<endl;
        cout<<"Name : "<<name<<endl;
    }
};
class Physics:public Marks
{
protected:
    int p;
public:
    Physics()
    {
        p=0;
    }
    Physics(int r,char n[],int pp):Marks(r,n)
    {
        p=pp;
    }
    void display()
    {
        Marks::display();
        cout<<"Physics : "<<p<<endl;
    }
};
class Chemistry:public Marks
{
protected:
    int c;
public:
    Chemistry()
    {
        c=0;
    }
    Chemistry(int r,char n[],int cc):Marks(r,n)
    {
        c=cc;
    }
    void display()
    {
        Marks::display();
        cout<<"Chemistry : "<<c<<endl;
    }
};
class Mathematics:public Marks
{
protected:
    int m;
public:
    Mathematics()
    {
        m=0;
    }
    Mathematics(int r,char n[],int mm):Marks(r,n)
    {
        m=mm;
    }
    void display()
    {
        Marks::display();
        cout<<"Mathematics : "<<m<<endl;
    }
};

int main()
{
    int n;
    cout<<"Enter the number of students : ";
    cin>>n;
    Physics p[n];
    Chemistry c[n];
    Mathematics m[n];
    for(int i=0;i<n;i++)
    {
        int r,p1,c1,m1;
        char name[20];
        cout<<"Enter the name of student "<<i+1<<" : ";
        cin>>name;
        cout<<"Enter the roll no. of student "<<i+1<<" : ";
        cin>>r;
        cout<<"Enter the marks in Physics : ";
        cin>>p1;
        cout<<"Enter the marks in Chemistry : ";
        cin>>c1;
        cout<<"Enter the marks in Mathematics : ";
        cin>>m1;
        p[i]=Physics(r,name,p1);
        c[i]=Chemistry(r,name,c1);
        m[i]=Mathematics(r,name,m1);
    }
    cout<<"The details of the students are : "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<"Student "<<i+1<<" : "<<endl;
        p[i].display();
        c[i].display();
        m[i].display();
    }
    return 0;
}
