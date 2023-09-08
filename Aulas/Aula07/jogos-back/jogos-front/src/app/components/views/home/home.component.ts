import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/models/Jogo';
import { JogoService } from 'src/app/services/jogo.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public jogos: Jogo[] = [];

  constructor(private jogoService: JogoService){ }


  ngOnInit(): void {
    this.fillJogos();
  }

  public fillJogos(): void{
    this.jogoService.getJogos().subscribe((response) => {
      this.jogos = response;
    })
  }


}
