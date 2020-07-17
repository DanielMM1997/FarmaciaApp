/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciaapp;
import model.*;
import gui.*;

public class FarmaciaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){        
        Catalogue c1 = new Catalogue ("DrugStore"); 
        //Creacion de productos que serán añadidos al catálogo de nuestra farmacia
        Product p1 = new Product("Ibuprofeno 600mg/g", 1, 1.75f, false, new Prospect ("Alivia el dolor de tipo muscular y articular. "));
        Product p2 = new Product("Crema solar SPF 80", 2, 7.0f, false, new Prospect ("Protege de las altas radiaciones del sol, apto para pieles atópicas. "));
        Product p3 = new Product("Aspirina 500mg", 3, 1.20f, false, new Prospect ("El ácido acetilsalicílico, principio activo de este medicamento actúa reduciendo los dolores ocasionales y la fiebre. "));
        Product p4 = new Product("Thrombocid 50g", 4, 9.06f, false, new Prospect ("Es una solución en pomada que podremos aplicar de forma cutánea con el fin de mejorar el flujo sanguíneo. "));
        Product p5 = new Product("Preservativos 10u", 5, 8.78f, false, new Prospect ("Previene las ETS, además proporcionan más sensibilidad y placer en las relaciones sexuales gracias a su grosor extrafino. "));
        Product p6 = new Product("Cepillo de dientes", 6, 2.35f, false, new Prospect ("Cepillo para higiene bucal diaria, con filamentos de dureza media. "));
        Product p7 = new Product("Listerine 200ml", 7, 5.70f , false, new Prospect ("Enjuague bucal, para una mayor y más profunda higiene bucal diaria. "));
        Product p8 = new Product("Cepillo electrico", 8, 9.5f, false, new Prospect ("Cepillo de dientes que gira la cabeza automáticamente para un mejor cepillado. "));
        Product p9 = new Product("Seda dental", 9, 3.3f, false, new Prospect ("Indicada para eliminar la placa bacteriana y los restos de los alimentos. "));
        Product p10 = new Product("Colágeno+Magnesio 500g", 10, 13.60f , false, new Prospect ("El Colágeno y el Magnesio tiene propiedades que ayudan el agotamiento tanto físico y mental. "));
        Product p11 = new Product("Jarabe de polen 200g", 11, 6.25f, false, new Prospect ("Contiene vitaminas importantes para un buen funcinamiento vascular. "));
        Product p12 = new Product("Arkomega 45 cápsulas", 12, 8.85f, false, new Prospect ("Complemento alimenticio con Omega 3 y Vitamina E, que ayuda a tu corazón a mantener un funcionamiento normal. "));
        Product p13 = new Product("Triptófano 100g", 13, 5.75f, false, new Prospect ("Complemento alimenticio a base de triptófano que ayuda a relajar, reducir el cansancio y la fatiga. "));
        Product p14 = new Product("Biberón", 14, 5.75f, false, new Prospect ("Usar a partir de un mes de edad. Reduce cólicos gracias a un nuevo sistema. "));
        Product p15 = new Product("Leche infantil en polvo 200g", 15, 14.60f, false, new Prospect ("Leche en polvo que contiene todos los nutrientes necesarios para tu bebé. "));
        Product p16 = new Product("Almax 500mg, 30u", 16, 5.95f, false, new Prospect ("El medicamento Almax es un antiácido que actúa como neutralizador del exceso de acidez en el estómago. "));
        Product p17 = new Product("Crema solar en spray SPF 50", 17, 7.0f, false, new Prospect ("Protege de las altas radiaciones del sol con su nueva fórmula en spray. "));
        Product p18 = new Product("After sun 300ml", 18, 6.5f, false, new Prospect ("Ayuda a reparar la salud de piel de los daños producidos por el sol. "));
        Product p19 = new Product("Bronseador SPF 30", 19, 5.65f, false, new Prospect ("Ayuda a bronsear tu piel de forma más rápida y segura. "));
        Product p20 = new Product("Pasta de diente 30ml", 20, 1.80f, false, new Prospect ("Blanquea tus dientes, protege de bacterias y los fortifica. "));
        Product p21 = new Product("Pañales de 6-12 meses, 30u", 21, 11.40f, false, new Prospect ("Pañales desechables con protección de hasta 12h. Respeta el pH de la piel, evitando irritaciones y rojeces. "));
        Product p22 = new Product("Papilla de frutas 600mg", 22, 7.80f, false, new Prospect ("Papilla con 8 cereales y frutas, aporta nutrientes que ayuda al desarrollo y crecimiento del bebé. "));
        Product p23 = new Product("Chupete", 23, 3.85f, false, new Prospect ("Chupete de silicona para bebés de 0 a 6 meses de edad. Estimula el correcto funcionamiento de la lengua. "));
        Product p24 = new Product("Juanola 30u", 24, 3.20f, false, new Prospect ("Las pastillas Juanola otorgan un buen sabor y aliento que perdura durante un buen período de tiempo. "));
        Product p25 = new Product("Strepsil pastillas 20u", 25, 7.26f, false, new Prospect ("Medicamento que posee una fuerte acción antiséptica por lo que combate de forma eficaz las infecciones de garganta. "));
        Product p26 = new Product("Aspirina efervecente 200mg", 26, 1.70f, false, new Prospect ("El ácido acetilsalicílico, principio activo de este medicamento actúa reduciendo los dolores ocasionales y la fiebre. "));
        Product p27 = new Product("Tantum 20u", 27, 3.06f, false, new Prospect ("Medicamento que ayuda a reducir la flema de la garganta. "));
        Product p28 = new Product("Colirio 10ml", 28, 3.75f, false, new Prospect ("Alivia la irritación ocular, con extracto de eufrasia y efecto hidratante. "));
        Product p29 = new Product("Thealoz 10ml", 29, 3.75f, false, new Prospect ("Es un solución oftálmica que lubrica y humedece los ojos cuando estos presentan una sensación de sequedad. "));
        Product p30 = new Product("Gafas graduadas", 30, 9.75f, false, new Prospect ("Gafas de diferentes graduaciones para no forzar la vista. "));
        Product p31 = new Product("Gafas de sol", 31, 8.0f, false, new Prospect ("Alta protección contra los rayos solares. Montura y patillas suaves y flexibles. "));
        Product p32 = new Product("Lubricante 100ml", 32, 7.50f, false, new Prospect ("Lubricante para relaciones sexuales, con efecto calor y frio, que aporta una sensación excitante. "));
        Product p33 = new Product("Gel para masaje erotico", 33, 8.20f, false, new Prospect ("Este gel hidratante está indicado para disfrutar de los momentos más íntimos. "));
        Product p34 = new Product("Energicil 30u", 34, 18.20f, false, new Prospect ("Complemento que aumentan el apetito sexual compuesto con maca, guaraná, ginseng y L-arginina. "));
        Product p35 = new Product("Desodorante bio 50ml", 35, 7.00f, false, new Prospect ("Desodorante en formato roll on, que aporta frescor durante 24 horas. "));
        Product p36 = new Product("Gel de ducha derma 500ml", 36, 11.63f, false, new Prospect ("Gel de ducha atópico para prevenir la sequedad cutánea y proporcionar un baño suave e hidratante. "));
        Product p37 = new Product("Maquinilla de afeitar", 37, 12.50f, false, new Prospect ("Maquinilla de Gillette, con un toque de aloe vera y 5 hojas de cuchilla ideal para pieles sencibles. "));
        Product p38 = new Product("Bálsamo 200ml", 38, 15.20f, false, new Prospect ("Bálsamo hidratante corporal, con extractos de aceites preciosos de flores. Para pieles muy secas. "));
        Product p39 = new Product("Crema hidratante 300ml", 39, 3.00f, false, new Prospect ("Crema hidratante corporal con urea, que regula la capa córnea. Contiene extracto de Tilia cordata. "));
        Product p40 = new Product("Cepillo Beter", 40, 5.60f, false, new Prospect ("Cuida de tu pelo ahora más que nunca gracias a los cepillos de Beter. "));
        Product p41 = new Product("Martiderm anticaida 50u", 41, 22.50f, false, new Prospect ("Estimula tu cabello desde el interior aportando un extra de vitalidad y fortaleza. "));
        Product p42 = new Product("Acondicionador 200ml", 42, 9.76f, false, new Prospect ("Acondicionador para nutrir, reparar y enriquecer el cabello seco. Aporta suavidad e hidratación a cabellos secos. "));
        Product p43 = new Product("Champú letiAt4 320ml", 43, 3.00f, false, new Prospect ("Champú emoliente y protector, especialmente indicado para pieles atópicas. Tanto de bebés, niños o adultos. "));
        Product p44 = new Product("Posay solución Micelar 200ml", 44, 5.85f, false, new Prospect ("Este producto está indicado para limpiar y desmaquillar la pieles sensibles. "));
        Product p45 = new Product("Crema antiarrugas 50g", 45, 6.71f, false, new Prospect ("Tratamiento antiedad indicado para prevenir la aparición de arrugas y líneas de expresión en rostro, cuello y escote. "));
        Product p46 = new Product("Martiderm DSO-crema 40ml", 46, 23.99f, false, new Prospect ("Reduce y previene las manchas, gracias a sus agentes como tratamiento despigmentante intensivo. "));
        Product p47 = new Product("Ducray Sérum 30ml", 47, 30.21f, false, new Prospect ("Sérum Ducray corrige las manchas más oscuras y gracias al ácido glicólico alisa el relieve de la piel. "));
        Product p48 = new Product("Toallitas desmaquillantes 30u", 48, 6.54f, false, new Prospect ("Estas toallitas permiten desmaquillarte de forma rápida y sin irritaciones. "));
        Product p49 = new Product("Crema solar SPF 80", 49, 6.78f, false, new Prospect ("Protege de las altas radiaciones del sol con su nueva fórmula. "));
        Product p50 = new Product("Bimanán sabor avena 300g", 50, 10.81f, false, new Prospect ("Es un complemento alimenticio indicado para dietas hipercalóricas e hiperproteicas. "));
        
        
        //inserción de productos en el catálogo de la farmacia
        c1.addProduct(p1);
        c1.addProduct(p2);
        c1.addProduct(p3);
        c1.addProduct(p4);
        c1.addProduct(p5);
        c1.addProduct(p6);
        c1.addProduct(p7);
        c1.addProduct(p8);
        c1.addProduct(p9);
        c1.addProduct(p10);
        c1.addProduct(p11);
        c1.addProduct(p12);
        c1.addProduct(p13);
        c1.addProduct(p14);
        c1.addProduct(p15);  
        c1.addProduct(p16);
        c1.addProduct(p17);
        c1.addProduct(p18);
        c1.addProduct(p19);
        c1.addProduct(p20);
        c1.addProduct(p21);
        c1.addProduct(p22);
        c1.addProduct(p23);
        c1.addProduct(p24);
        c1.addProduct(p25);
        c1.addProduct(p26);
        c1.addProduct(p27);
        c1.addProduct(p28);
        c1.addProduct(p29);
        c1.addProduct(p30);
        c1.addProduct(p31);
        c1.addProduct(p32);
        c1.addProduct(p33);
        c1.addProduct(p34);
        c1.addProduct(p35);
        c1.addProduct(p36);
        c1.addProduct(p37);
        c1.addProduct(p38);
        c1.addProduct(p39);
        c1.addProduct(p40);
        c1.addProduct(p41);
        c1.addProduct(p42);
        c1.addProduct(p43);
        c1.addProduct(p44);
        c1.addProduct(p45);
        c1.addProduct(p46);
        c1.addProduct(p47);
        c1.addProduct(p48);
        c1.addProduct(p49);
        c1.addProduct(p50);
        
        Category ca = new Category ("Todos");
        Category ca1 = new Category("Cremas solares");
        Category ca2 = new Category("Higiene bucal");
        Category ca3 = new Category("Infantil");
        Category ca4 = new Category("Pastillas");
        Category ca5 = new Category("Suplementos");
        Category ca6 = new Category("Óptica");
        Category ca7 = new Category("Salud sexual");
        Category ca8 = new Category("Higiene corparal");
        Category ca9 = new Category("Higiene cabello");
        Category ca10 = new Category("Cosmética");
        
        c1.addCategory(ca);
        c1.addCategory(ca1);
        c1.addCategory(ca2);
        c1.addCategory(ca3);
        c1.addCategory(ca4);
        c1.addCategory(ca5);
        c1.addCategory(ca6);
        c1.addCategory(ca7);
        c1.addCategory(ca8);
        c1.addCategory(ca9);
        c1.addCategory(ca10);

        
        ca.addProductToCategory(p1);
        ca.addProductToCategory(p2);
        ca.addProductToCategory(p3);
        ca.addProductToCategory(p4);
        ca.addProductToCategory(p5);
        ca.addProductToCategory(p6);
        ca.addProductToCategory(p7);
        ca.addProductToCategory(p8);
        ca.addProductToCategory(p9);
        ca.addProductToCategory(p10);
        ca.addProductToCategory(p11);
        ca.addProductToCategory(p12);
        ca.addProductToCategory(p13);
        ca.addProductToCategory(p14);
        ca.addProductToCategory(p15);
        ca.addProductToCategory(p16);
        ca.addProductToCategory(p17);
        ca.addProductToCategory(p18);
        ca.addProductToCategory(p19);
        ca.addProductToCategory(p20);
        ca.addProductToCategory(p21);
        ca.addProductToCategory(p22);
        ca.addProductToCategory(p23);
        ca.addProductToCategory(p24);
        ca.addProductToCategory(p25);
        ca.addProductToCategory(p26);
        ca.addProductToCategory(p27);
        ca.addProductToCategory(p28);
        ca.addProductToCategory(p29);
        ca.addProductToCategory(p30);
        ca.addProductToCategory(p31);
        ca.addProductToCategory(p32);
        ca.addProductToCategory(p33);
        ca.addProductToCategory(p34);
        ca.addProductToCategory(p35);
        ca.addProductToCategory(p36);
        ca.addProductToCategory(p37);
        ca.addProductToCategory(p38);
        ca.addProductToCategory(p39);
        ca.addProductToCategory(p40);
        ca.addProductToCategory(p41);
        ca.addProductToCategory(p42);
        ca.addProductToCategory(p43);
        ca.addProductToCategory(p44);
        ca.addProductToCategory(p45);
        ca.addProductToCategory(p46);
        ca.addProductToCategory(p47);
        ca.addProductToCategory(p48);
        ca.addProductToCategory(p49);
        ca.addProductToCategory(p50);
        
        
        ca1.addProductToCategory(p17);
        ca1.addProductToCategory(p18);
        ca1.addProductToCategory(p19);
        ca1.addProductToCategory(p49);
        ca2.addProductToCategory(p6);
        ca2.addProductToCategory(p7);
        ca2.addProductToCategory(p8);
        ca2.addProductToCategory(p9);
        ca2.addProductToCategory(p20);
        ca3.addProductToCategory(p14);
        ca3.addProductToCategory(p15); 
        ca3.addProductToCategory(p21);
        ca3.addProductToCategory(p22);
        ca3.addProductToCategory(p23);
        ca4.addProductToCategory(p16);
        ca4.addProductToCategory(p1);
        ca4.addProductToCategory(p3);  
        ca4.addProductToCategory(p24);
        ca4.addProductToCategory(p25);
        ca4.addProductToCategory(p26);
        ca4.addProductToCategory(p27);
        ca5.addProductToCategory(p10);
        ca5.addProductToCategory(p11);
        ca5.addProductToCategory(p12);
        ca5.addProductToCategory(p13);
        ca5.addProductToCategory(p50);
        ca6.addProductToCategory(p28);
        ca6.addProductToCategory(p29);
        ca6.addProductToCategory(p30);
        ca6.addProductToCategory(p31);
        ca7.addProductToCategory(p5);
        ca7.addProductToCategory(p32);
        ca7.addProductToCategory(p33);
        ca7.addProductToCategory(p34);
        ca8.addProductToCategory(p35);
        ca8.addProductToCategory(p36);
        ca8.addProductToCategory(p37);
        ca8.addProductToCategory(p38);
        ca8.addProductToCategory(p39);
        ca9.addProductToCategory(p40);
        ca9.addProductToCategory(p41);
        ca9.addProductToCategory(p42);
        ca9.addProductToCategory(p43);
        ca10.addProductToCategory(p44);
        ca10.addProductToCategory(p45);
        ca10.addProductToCategory(p46);
        ca10.addProductToCategory(p47);
        ca10.addProductToCategory(p48);
        
        //visualización de los productos que ofrece nuestra farmacia
        ShoppingCart s = new ShoppingCart(new Date("15/10/2019"));        
        DrugStore farmacia = new DrugStore(c1, s); 
        CuentasApp cuentas = new CuentasApp();
        
        FarmaciaForm farmaciaForm = new FarmaciaForm();
        farmaciaForm.assignDrugStore(farmacia); 
        farmaciaForm.assignCuentas(cuentas);
        farmaciaForm.showCategoryProducts();
        farmaciaForm.showAll();        
    }
}