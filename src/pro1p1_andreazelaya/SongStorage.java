package pro1p1_andreazelaya;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SongStorage {

    public static ArrayList<Cancion> playlist = new ArrayList<>();
    public static String name;
    public static String album;
    public static String artist;
    public static int segundos;
    public static int year;

    public static void registrarSong() {
        Cancion song = new Cancion(name, album, artist, segundos, year);
        playlist.add(song);
    }

    public String songName(String name) {
        this.name = name;
        return name;
    }

    public String albumName(String album) {
        this.album = album;
        return album;
    }

    public String artistName(String artist) {
        this.artist = artist;
        return artist;
    }

    public int songLength(int segundos) {
        this.segundos = segundos;
        return segundos;
    }

    public int songYear(int year) {
        this.year = year;
        return year;
    }


    public static String getName() {
        return name;
    }

    public static String getAlbum() {
        return album;
    }

    public static String getArtist() {
        return artist;
    }

    public static int getSegundos() {
        return segundos;
    }

    public static int getYear() {
        return year;
    }
    
    

    public static String getSongList() {
        String songList = "";

        for (Cancion cancion : playlist) {
            songList = songList + (playlist.indexOf(cancion) + 1) + ". " + cancion.getSong() + " - " + cancion.getArtist() + "\n";
        }
        return songList;
    }

    public static void eliminate(int num) {
        if (num <= playlist.size()) {
            playlist.remove(num - 1);
        } else {
            JOptionPane.showMessageDialog(null, "Error. Ingrese un índice válid0.");
        }
    }

    public static String information(int num) {
        String info = "";
        if (num <= playlist.size()) {

            Cancion song = playlist.get(num);
            

            info = "Nombre: " + song.getSong() + "\n"
                    + "Album: " + song.getAlbum() + "\n"
                    + "Arist: " + song.getArtist() + "\n"
                    + "Duración: " + song.getSeconds() + "\n"
                    + "Año: " + song.getYear();
        } else {
            info = "Error. Ingrese un índice válido.";
        }

        return info;
    }

    public static Cancion modificar() {
        Cancion song;
        String canciones = getSongList();
        String output = canciones + "\n" + "Ingrese el índice de la cancion que desea modificar";

        String strOp = JOptionPane.showInputDialog(null, output);
        int opc = Integer.parseInt(strOp);

        if (opc <= playlist.size()) {

            song = playlist.get(opc-1);
            return song;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un indice válido");
            return null;
        }
        
    }
    
    
}
