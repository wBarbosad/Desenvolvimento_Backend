import { Component, OnInit } from '@angular/core';
import { Cosmetico } from 'src/app/models/cosmetico';
import { CosmeticoService } from 'src/app/services/cosmetico.service';

@Component({
  selector: 'app-listagem-cosmetico',
  templateUrl: './listagem-cosmetico.component.html',
  styleUrls: ['./listagem-cosmetico.component.css']
})
export class ListagemCosmeticoComponent implements OnInit{

  public cosmeticos!: Cosmetico[];

  constructor(private cosmeticoService: CosmeticoService){ }

  ngOnInit(): void {
    this.ListarCosmeticos()
  }

  public ListarCosmeticos(){
    this.cosmeticoService.listagemProduto().subscribe((response) => {
      this.cosmeticos = response;
    })
  }

}
