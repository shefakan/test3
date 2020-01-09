import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { AboutComponent } from './component/about/about.component';
import { PokedexComponent } from './component/pokedex/pokedex.component';
import { PokemonService } from './service/pokemon.service';
import { PresidentComponent } from './president/president.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
  
    PokedexComponent,
  
    PresidentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [PokemonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
