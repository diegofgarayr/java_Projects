#include <iostream>
using namespace std;
int main (){
    int num;
    cout<<"Ingrese el numero, para verificar el grado:";
    cin>>num;
         if { num <0 || num > 100}
         {
            cout<<"Numero no valido";
         }
         else if{num >= 0 && num < 50}{
            cout<<"No es psoible agregarle un grado";
         }
          else if{num >= 50 && num < 60}{
            cout<<"Grado D";
          }
          else if{num >= 60 && num < 70}{
            cout<<"Grado C";
          }
          else if{num >= 70 && num < 80}{
            cout<<"Grado B";
          }
          else if{num >= 80 && num < 90}{
            cout<<"Grado A";
          }
          else if{num >= 90 && num <= 100}{
            cout<<"Grado A+";
          }
}