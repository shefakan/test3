import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/Pokemon';
import { PokemonService } from 'src/app/service/pokemon.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})



export class PokedexComponent implements OnInit {

  constructor(private pokeService :PokemonService) { }

  ngOnInit() {
    this.displayAllPokemon();
  }

  pokemonList :Pokemon;  
  allPokemon :Observable<Pokemon> = this.pokeService.getAllPokemon();

  text :string;


  displayAllPokemon() {

    this.allPokemon.subscribe(
      //function to execute when the Observable
      //receives information because the call is successful.
      (response) => {
        this.pokemonList = response;
        console.log(this.pokemonList);
      },
      //function to execute when the Observabler receives
      //incorrect/faulty information -> call is unsuccessful.
      (response) => {
        return "Sorry it failed";
      }
    );
  }

  

}
