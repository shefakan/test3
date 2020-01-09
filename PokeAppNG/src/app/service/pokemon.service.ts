import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pokemon } from '../models/Pokemon';

// @Injectable is a decorator that marks a class as a target for
// dependency injection. The class needs to have the HttpClient
// object injected into it. This class is a candidate for dependency
// injection because it is declared inside the AppModule's providers array.
@Injectable({
  providedIn: 'root'
})
export class PokemonService {

  private headers = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(private http :HttpClient) { }


  getAllPokemon() :Observable<Pokemon> {
    return this.http.get<Pokemon>("http://numbersapi.com/random/year?json");
  }

 
}
