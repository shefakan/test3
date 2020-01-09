import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './component/about/about.component';

import { PokedexComponent } from './component/pokedex/pokedex.component';


const routes: Routes = [
  {path : 'about', component : AboutComponent},
 
  {path : 'pokedex', component : PokedexComponent},
  {path : '', redirectTo: '/about', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
