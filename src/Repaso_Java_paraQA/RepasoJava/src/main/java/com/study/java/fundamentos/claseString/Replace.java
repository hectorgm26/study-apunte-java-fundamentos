package com.study.java.fundamentos.claseString;

public class Replace {
    public static void main(String[] args) {

        // El metodo replace() reemplaza una letra por otra letra, o una palabra por otra en una cadena de texto
        // Es un metodo que no modifica la cadena original, sino que devuelve una nueva cadena con el cambio
        // Devuelve una nueva cadena con el cambio
        // Recibe dos argumentos, el primero es el caracter o la cadena a reemplazar y el segundo es el nuevo caracter o cadena
        // El metodo replace() es sensible a mayusculas y minusculas, es decir, se debe especificar la letra mayuscula si se quiere reemplazar
        // La coincidencia debe ser exacta, es decir, que se respeta de forma exacta el target y el replacement

        String carrera = "Derecho";
        String nuevaCarrera = carrera.replace("Derecho", "Programador");
        System.out.println("Antes estudie: " + carrera + " y ahora soy: " + nuevaCarrera);

        String cadenaOriginal = "Ke tal buen dia!";
        String cadenaModificada = cadenaOriginal.replace("Ke", "Que");
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena modificada: " + cadenaModificada);
        // si no se respetan las mayusculas o minusculas, no se hara ningun cambio
        // Y si se intenta reemplazar una letra que no existe, no se hara ningun cambio

        String cadenaO = "Wena Pedro Pedro Pascal";
        String cadenaM = cadenaO.replace("Pedro", "Yanira");
        System.out.println(cadenaM);
        // En el caso de que la palabra a reemplazar este repetida, se reemplazara todas las veces que aparezca


        // UTILIDAD Y USO - VALIDACIONES DE SEGURIDAD PARA EVITAR INYECCIONES SQL
        String nombreFormulario = "<script>alert('HACKEADO')</script>";
        // Se puede usar el replace para eliminar caracteres no deseados
        String nombreFormularioLimpio = nombreFormulario.replace("<script>", "").replace("</script>", "").replace("'", "");
        // Se anidan varios replace para eliminar todos los caracteres no deseados
    }
}
