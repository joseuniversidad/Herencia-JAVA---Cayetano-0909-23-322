import org.w3c.dom.ls.LSOutput;

//EJERCICIO 1
public class Empleado extends Persona{
    private String area;

    public Empleado(String nombre, String apellido, int edad, String area){
        super (nombre, apellido, edad);
        this.area = area;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area = area;
    }
    public void imprimir(){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " + getEdad()+ "\nArea: " + getArea());
    }

}
//EJERCICIO 2
class Empleado2 extends Persona{
    private String area;
    private int codigoIdentificacion;

    public Empleado2(String nombre, String apellido, int edad, String area, int codigoIdentificacion){
        super (nombre, apellido, edad);
        this.area = area;
        this.codigoIdentificacion = codigoIdentificacion;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area = area;
    }

    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }
    public void setCodigoIdentificacion(int codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }
    public void imprimir2(){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " + getEdad()+ "\nArea: " + getArea() + "\nCodigoIdentificacion: "+ getCodigoIdentificacion());
    }

}

//EJERCICIO 3
class Jugador extends Persona{
    private String Posicion;
    private double numeroCalzado;
    private int dorzal;

    public Jugador (String nombre, String apellido, int edad, String Posicion, double numeroCalzado, int dorzal ){
        super(nombre, apellido, edad);
        this.Posicion= Posicion;
        this.numeroCalzado= numeroCalzado;
        this.dorzal= dorzal;
    }

    public String getPosicion() {
        return Posicion;
    }

    public double getNumeroCalzado() {
        return numeroCalzado;
    }

    public int getDorzal() {
        return dorzal;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    public void setNumeroCalzado(double numeroCalzado) {
        this.numeroCalzado = numeroCalzado;
    }

    public void setDorzal(int dorzal) {
        this.dorzal = dorzal;
    }

    public void imprimir3(){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " + getEdad()+ "\nPosicion: " + getPosicion() +"\nNumero de Calzado: " + getNumeroCalzado() + "\nDorzal: " +  getDorzal() );
    }
}

//EJERCICIO 4
class determinando extends Persona{
    private int num1;

    public determinando (String nombre, String apellido, int edad, int num1){
        super(nombre, apellido, edad);
        this.num1=num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void Imprimir4(){
        if (num1 % 2 == 0){
            System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " +  "\nSU NUMERO ES PAR:" + getNum1());
        }
        else{
            System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " + getEdad() +  "\nSU NUMERO ES IMPAR:" + getNum1());
        }
    }
}

//EJERCICIO 5
class Multiplicacion extends Persona{
    private int nume2;

    public Multiplicacion (String nombre, String apellido, int edad, int nume2){
        super(nombre, apellido, edad );
        this.nume2= nume2;
    }
    public int getNume2() {
        return nume2;
    }

    public void setNume2(int nume2) {
        this.nume2 = nume2;
    }
    public void imprimir5 (){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " +  "\nTabla de Multiplicar:" + getNume2());
        System.out.println("Tabla de multiplicar del número " + nume2 + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = nume2 * i;
            System.out.println(nume2 + " x " + i + " = " + resultado);
        }


    }
}

//EJERCICIO 6
class Fibonaccio extends Persona{
    private int num3;

    public Fibonaccio (String nombre, String apellido, int edad, int num3 ){
        super(nombre, apellido, edad);
        this.num3=num3;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void imprimir6 (){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " +  "\nTabla de Multiplicar:" + getNum3());
        int a = 0;
        int b = 1;
        int i = 1;

        System.out.println("Serie de Fibonacci hasta el término " + num3 + ":");
        System.out.print(a + " " + b + " ");

        while (i <= num3 - 2) {
            int fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;
            i++;
        }
    }
}

//Ejercicio 7
class vehiculo extends Persona {
    private String modelo;
    private String placa;
    private String velocidadMax;

    public vehiculo (String nombre, String apellido, int edad, String modelo, String placa, String velocidadMax){
        super(nombre, apellido, edad);
        this.modelo=modelo;
        this.placa=placa;
        this.velocidadMax=velocidadMax;

    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getVelocidadMax() {
        return velocidadMax;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public void imprimir7(){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " +  "\nModelo:" + getModelo()+ "\nPlaca :" + getPlaca()  + "\nVelocidadMax :" + getVelocidadMax() );
    }
}
//EJERCICIO 8
class Catedratico extends Persona{
   private String Curso;
   private int aniosExperiencia;
   private String Horario;
   private String interesadoen;
   private String deporte;

   public Catedratico(String nombre, String apellido, int edad, String Curso, int aniosExperiencia, String Horario, String interesadoen, String deporte){
       super(nombre, apellido, edad);
       this.Curso=Curso;
       this.aniosExperiencia= aniosExperiencia;
       this.Horario=Horario;
       this.interesadoen= interesadoen;
       this.deporte=deporte;

   }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getInteresadoen() {
        return interesadoen;
    }

    public void setInteresadoen(String interesadoen) {
        this.interesadoen = interesadoen;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void imprimir8(){
        System.out.println("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " +  "\nCurso:" + getCurso() +
                "\nAños de Experiencia:" + getAniosExperiencia() +
                "\nHorario:" + getHorario() +
                "\nCurso Interesado en Brindar:" + getInteresadoen() +
                "\nDeporte:" +  getDeporte());
    }
}
//EJERCICIO 9
class factorial extends Persona{
    private int num4;

    public factorial (String nombre, String apellido, int edad, int num4){
        super(nombre, apellido, edad);
        this.num4= num4;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public void imprimir9() {
        System.out.println("\nNombre: " + getNombre() + "\nApellido:" + getApellido() + "\nEdad: " + getEdad() + "\nFactorial : " + getNum4());

        if (num4 > 0) {
            System.out.println("El número ingresado es POSITIVO.");
            System.out.println("\n");
        } else if (num4 < 0) {
            System.out.println("El número ingresado es NEGATIVO.");
            System.out.println("\n");
        } else {
            System.out.println("El número ingresado es CERO.");
            System.out.println("\n");
        }
    }

}

//EJERCICIO 10
class Fashion extends Persona{
    private String Talla;
    private String marcaFavorita;
    private int anioBisiesto;

    public Fashion (String nombre, String apellido, int edad, String Talla,String marcaFavorita, int anioBisiesto){
        super(nombre, apellido, edad);
        this.Talla=Talla;
        this.marcaFavorita=marcaFavorita;
        this.anioBisiesto=anioBisiesto;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String talla) {
        Talla = talla;
    }

    public String getMarcaFavorita() {
        return marcaFavorita;
    }

    public void setMarcaFavorita(String marcaFavorita) {
        this.marcaFavorita = marcaFavorita;
    }

    public int getAnioBisiesto() {
        return anioBisiesto;
    }

    public void setAnioBisiesto(int anioBisiesto) {
        this.anioBisiesto = anioBisiesto;
    }

    public boolean imprimir10 (){
        System.out.println ("\nNombre: " + getNombre()+ "\nApellido:" + getApellido() + "\nEdad: " +  "\nTalla:" + getTalla() +
                "\nMarca Favorita:" + getMarcaFavorita() +
                "\nAño Bisiesto " + getAnioBisiesto());

        if ((anioBisiesto % 4 == 0 && anioBisiesto % 100 != 0) || anioBisiesto % 400 == 0) {
            return true;
        } else {
            return false;
        }


    }
}



