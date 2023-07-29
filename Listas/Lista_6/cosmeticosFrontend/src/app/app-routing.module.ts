import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { ListagemCosmeticoComponent } from './components/views/cosmeticos/listagem-cosmetico/listagem-cosmetico.component';

const routes: Routes = [
  {path: '', component: HomeComponent },
  {path: 'listagem-produto', component: ListagemCosmeticoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
