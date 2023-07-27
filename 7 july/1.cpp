#include<iostream>
using namespace std;
class test
{
      int c, r;
      test(int cc, int rr=0)
      {
             c=cc;
             r=rr;
      }
      void display( )
     {
          cout<<"c="<<c<<"\t r="<<r<<endl;
      }

};
int main( )
{
     test t1(10, 20);
     t1.display();
     return 0;
}