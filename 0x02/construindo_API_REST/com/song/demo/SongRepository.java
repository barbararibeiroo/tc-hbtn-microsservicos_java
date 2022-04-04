package com.song.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
   private List<Song> list = new ArrayList<Song>();

   public List<Song> getAllSongs() {
    return list;
   }

   public Song getSongById(Integer id) {
	for (Song song : list) {
		if(song.getId().equals(id)) {
			return new Song(song.getId(), song.getNome(), song.getArtista(), song.getAlbum(), song.getAnoLancamento());
		}
	}
	   
	   return null;
     
   }

   public void addSong(Song s) {
	   list.add(s);
   }

   public void updateSong(Song s) {
	   for(Song songs : list) {
	    	  if(songs.getId().equals(s)) {
	    		  list.replaceAll(r -> s);;
	    	  }
	      }
   }

   public void removeSong(Song s) {
      list.remove(s);
   }
}