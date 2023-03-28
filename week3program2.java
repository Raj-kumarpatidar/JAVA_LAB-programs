public class complex
{
    //define data members
    int real_1;
    int real_2;
    int imag_1;
    int imag_2;

    //constructor for creating object of class complex
    public complex(){
        this.real_1=0;
        this.real_2=0;
        this.imag_1=0;
        this.imag_2=0;
    }
    // parametrized constuructor for creating object of class complex 
    public complex(int real_1,int real_2,int imag_1,int imag_2)
    {
        this.real_1=real_1;
        this.real_2=real_2;
        this.imag_1=imag_1;
        this.imag_2=imag_2;
    }


    // getter method
    public int getReal_1(){
        return real_1;
    }   
    public int getReal_2(){
        return real_2;
    }
    public int getImag_1(){
        return imag_1;
    }
    public int getImag_2(){
        return imag_2;
    }

    // setter method
    public void setReal_1(int real_1)
    {
        this.real_1=real_1;

    }
    public void setReal_2(int real_2)
    {
        this.real_2=real_2;
    }

    public void setImag_1(int imag_1)
    {
        this.imag_1=imag_1;
    }
    public void setImag_2(int imag_2)
    {
        this.imag_2=imag_2;
    }

    // add
    public int addReal(){
        return real_1+real_2;
    }
    public int addImag(){
        return imag_1+imag_2;
    }
    //multiply
    public int multiplyReal(){
        return real_1*real_2;
    }
    public int multiplyImag(){
        return imag_1*imag_2;
    }
    // difference
    public int differenceReal(){
        return real_1-real_2;
    }
    public int differenceImag(){
        return imag_1-imag_2;
    }
     


}

public class week3program2
{
    public static void main(String args[])
    {
        Complex cm=new Complex(5,2,5,2);
        int addReal=addReal();
        int addImag=addImag();

        System.out.println(addReal+"+"+addImag+"i");
        int multiplyReal=multiplyReal();
        int multiplyImag=multiplyImag();

        System.out.println(multiplyReal+"+"+multiplyImag+"i");
        
        int differenceReal=differenceReal();
        int differenceImag=differenceImag();

        System.out.println(differenceReal+"+"+differenceImag+"i");

    }
}