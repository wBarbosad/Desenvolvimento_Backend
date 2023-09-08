import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/models/Jogo';
import { JogoService } from 'src/app/services/jogo.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit{

  jogo: Jogo = new Jogo();

  constructor(private jogoService: JogoService){ }


  ngOnInit(): void {

  }
  public saveJogo(): void{
     this.jogoService.postJogos(this.jogo).subscribe((response) => {

      alert("O jogo " + this.jogo.nome + " foi cadastrado com sucesso!")
    })
  }


}
