

public class ClaseB {
    public static void main(String[] args) {

        //Datos del viaje

        double D1 = 35.0,  D2 = 72.0, D3 = 53.0; // Distancia
        double T1 = 0.7,  T2 = 1.6, T3 = 1.1; // Tiempo
        double L1 = 4.4,  L2 = 9.0, L3 = 6.2; // Litros
        double precioLitro = 1.42, largo = 2.2, ancho = 1.3, alto = 1.0; // Metros
        int masaCargaKg = 1450;
        double P1 = 3.2, P2 = 3.8,  P3 = 2.7; // Peajes 
        double deprecPorKm = 0.085, volCamionM3 = 12.0; // Camion
        double fCO2 = 2.64,  galPorLitro = 0.264172; // kg/L 
        int Vmin = 30,  Vmax = 90, Va = 40, Vb = 80; // Velocidades
        double Ca = 0.05, Cb = 0.09; 
        double a = -0.0009, b = 0.09, c = 3.8;

        System.out.println("1. Velocidades y Rendimiento:");

        double V1 = 0, V2 = 0, V3 = 0, Vprom = 0;

        V1 = D1 / T1;
        //Redondear a 2 decimales
        V1 = Math.round(V1 * 100.0) / 100.0;
        V2 = D2 / T2;
        V2 = Math.round(V2 * 100.0) / 100.0;
        V3 = D3 / T3;
        V3 = Math.round(V3 * 100.0) / 100.0;
        Vprom = ((D1 * V1)+(D2 * V2)+(D3 * V3))/(D1 + D2 + D3);
        Vprom = Math.round(Vprom * 100.0) / 100.0;

        System.out.println("V1: " + V1 + " km/h");
        System.out.println("V2: " + V2 + " km/h");
        System.out.println("V3: " + V3 + " km/h");
        System.out.println("Vprom: " + Vprom + " km/h" + "\n"); // \n es un salto de linea
        

        System.out.println("2. Rendimiento por tramo:" + "\n");

        double kml1 = 0, kml2 = 0, kml3 = 0, kmlTotal = 0;

        kml1 = D1 / L1;
        kml1 = Math.round(kml1 * 100.0) / 100.0;
        kml2 = D2 / L2;
        kml2 = Math.round(kml2 * 100.0) / 100.0;
        kml3 = D3 / L3;
        kml3 = Math.round(kml3 * 1000.0) / 1000.0;
        kmlTotal = (D1 + D2 + D3)/(L1 + L2 + L3);
        // Redondear para 3 decimales
        kmlTotal = Math.round(kmlTotal * 1000.0) / 1000.0;

        System.out.println("Kml 1: " + kml1 );
        System.out.println("Kml 2: " + kml2 );
        System.out.println("Kml 3: " + kml3 );
        System.out.println("Kml Total: " + kmlTotal + "\n" );

        System.out.println("3. Costos directos:" + "\n");

        double costoComb = 0, deprec = 0, peajes = 0, costoDirecto = 0, costoPorKm = 0;

        costoComb = (L1 + L2 + L3) * precioLitro;
        costoComb = Math.round(costoComb * 1000.0) / 1000.0;
        deprec = (D1 + D2 + D3) * deprecPorKm;
        deprec = Math.round(deprec * 1000.0) / 1000.0;
        peajes = (P1 + P2 + P3);
        peajes = Math.round(peajes * 1000.0) / 1000.0;
        costoDirecto = (costoComb + deprec + peajes);
        costoDirecto = Math.round(costoDirecto * 1000.0) / 1000.0;
        costoPorKm = costoDirecto / (D1 + D2 + D3);
        costoPorKm = Math.round(costoPorKm * 1000.0) / 1000.0;

        System.out.println("Comb: " + costoComb );
        System.out.println("Dep: " + deprec );
        System.out.println("Peajes: " + peajes );
        System.out.println("Directo: " + costoDirecto );
        System.out.println("Por Km: " + costoPorKm + "\n" );

        System.out.println("4. Volumen, densidad y Ocupacion:" + "\n");

        double VolumenM3 = 0, densidad = 0, Ocupacion = 0;

        VolumenM3 = (largo * ancho * alto);
        VolumenM3 = Math.round(VolumenM3 * 1000.0) / 1000.0;
        densidad = masaCargaKg / VolumenM3;
        densidad = Math.round(densidad * 1000.0) / 1000.0;
        Ocupacion = VolumenM3 / volCamionM3; 
        Ocupacion = Math.round(Ocupacion * 1000.0) / 1000.0;

        System.out.println("Volumen: " + VolumenM3 + " m³" );
        System.out.println("Densidad: " + densidad + " kg/m³" );
        System.out.println("Ocupacion: " + Ocupacion + "\n" );

        System.out.println("5. Emisiones de CO₂:" + "\n");

        double CO2Total = 0, CO2PorKm = 0;

        CO2Total = (L1 + L2 + L3) * fCO2;
        CO2Total = Math.round(CO2Total * 1000.0) / 1000.0;
        CO2PorKm = CO2Total / (D1 + D2 + D3);
        CO2PorKm = Math.round(CO2PorKm * 1000.0) / 1000.0;

        System.out.println("CO₂ Total: " + CO2Total + " kg");
        System.out.println("CO₂ Por Km: " + CO2PorKm + " Kg/km\n");

        System.out.println("6. Conversiones y normalización:" + "\n");

        double VmProm = 0, galTot = 0, Vnorm = 0;

        VmProm = Vprom * (1000/3600);
        galTot = (L1 + L2 + L3) * galPorLitro;
        galTot = Math.round(galTot * 10000.0) / 10000.0;
        Vnorm = ((Vprom - Vmin)) / ((Vmax - Vmin));
        Vnorm = Math.round(Vnorm * 1000.0) / 1000.0;

        System.out.println("gal Total: " + galTot);
        System.out.println("Vnorm: " + Vnorm + "\n");

        System.out.println("7. Promedios y dispersión:" + "\n");

        double Vmedia = 0, ó = 0, Vpond_t = 0;

        Vmedia = (V1 + V2 + V3) / 3; 
        Vmedia = Math.round(Vmedia * 1000.0) / 1000.0;
        ó = Math.sqrt((Math.pow(V1 - Vmedia, 2) + Math.pow(V2 - Vmedia, 2) + Math.pow(V3 - Vmedia, 2)) / 3);
        ó = Math.round(ó * 1000.0) / 1000.0;
        Vpond_t = ((T1 * V1) + (T2 * V2) + (T3 * V3))/(T1 + T2 + T3);
        Vpond_t = Math.round(Vpond_t * 1000.0) / 1000.0;

        System.out.println("Vmedia: " + Vmedia);
        System.out.println("ó: " + ó);
        System.out.println("Vpond_t: " + Vpond_t + "\n");

        System.out.println("8. Interpolacón lineal:" + "\n");

        double Cprom = 0, CostoMant = 0;

        Cprom = Ca + (Cb - Ca) * ((Vprom - Va) / (Vb - Va)); 
        Cprom = Math.round(Cprom * 10000.0) / 10000.0;
        CostoMant = Cprom * (D1 + D2 + D3); 
        Cprom = Math.round(Cprom * 1000.0) / 1000.0;

        System.out.println("Cprom: " + Cprom);
        System.out.println("CostoMant: " + CostoMant + "\n");

        System.out.println("9. Modelo polinomico de rendimiento:" + "\n");

        double v = Vprom, kmlv = 0, kmlModelo = 0, litrosModelo = 0;

        kmlv = a * Math.pow(v, 2) + b * v + c; 
        kmlv = Math.round(kmlv * 10000.0) / 10000.0;
        kmlModelo = kmlv; 
        kmlModelo = Math.round(kmlModelo * 1000.0) / 1000.0;
        litrosModelo = (D1 + D2 + D3)/ kmlModelo; 
        litrosModelo = Math.round(litrosModelo * 1000.0) / 1000.0;

        System.out.println("kml Modelo: " + kmlModelo);
        System.out.println("Litros Modelo: " + litrosModelo + "\n");

        System.out.println("10. Indice de eficiencia (Score):" + "\n");

        double w1 = 0.25, w2 = 0.25, w3 = 0.25, w4 = 0.25, Score = 0;

        Score = (w1 * (1 / costoPorKm)) + (w2 * kmlTotal) + (w3 * (1 / CO2PorKm)) + (w4 * ( 1 / (1 + ó))); 
        Score = Math.round(Score * 10000.0) / 10000.0;

        System.out.println("Score: " + Score + "\n");
    }
}