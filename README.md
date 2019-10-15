# Materi Asistensi 11 Oktober 2019

## Pengertian
**Pewarisan** (_inheritance_) adalah suatu cara pembuatan class
baru dengan menggunakan kembali class yang sudah
didefinisikan sebelumnya dengan menambahkan atribut dan
method baru.

## Istilah dalam _Inheritance_

* **Sub class**, digunakan untuk menunjukkan class anak atau turunan secara
hirarkis dari super class.
* **Super class**, digunakan untuk menunjukkan class induk secara hirarkis dari
sub class (class anak).
* **Extends**, digunakan untuk menunjukkan bahwa suatu class merupakan
turunan dari class lain. Misal A extends B, berarti class A adalah turunan dari
class B. A merupakan subclass, sedangkan B merupakan superclass.•
* **Super**, digunakan untuk memanggil konstruktor dari super class atau
memanggil variabel yang mengacu pada super class. Misal super(x,y,z), berarti
atribut x, y, dan z diambil dari atribut pada class induk.

## Source Code
```
public class SubClass extends SuperClass{
    super(parameter);
    super.variabel;
    super.method();
}
```

## OVERRIDING
* **Overriding** adalah suatu cara untuk mendefinisikan ulang
method yang ada pada class induk apabila class anak menginginkan
adanya informasi yang lain.
* Overriding dilakukan dengan cara **menulis ulang method yang
ada pada class induk** dengan syarat bahwa nama dan parameter
fungsi tersebut harus sama (tidak boleh diubah).

## OVERLOADING
* **Overloading** fungsi adalah penulisan beberapa fungsi (dua atau
lebih) yang memiliki nama yang sama. Pada bahasan overloading
dikenal istilah signature. Signature sebuah fungsi adalah parameter
lengkap dengan tipe datanya yang terdapat dalam fungsi tersebut.