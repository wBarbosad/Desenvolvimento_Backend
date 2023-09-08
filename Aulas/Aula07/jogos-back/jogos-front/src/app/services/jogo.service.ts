import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Jogo } from '../models/Jogo';

@Injectable({
  providedIn: 'root'
})

export class JogoService {

  private rota: string = "http://localhost:8080/jogos"
  constructor(private http: HttpClient){ }

  public getJogos(): Observable<Jogo[]>{
   return this.http.get<Jogo[]>(this.rota)
  }

  public postJogos(jogo: Jogo): Observable<Jogo>{
    return this.http.post<Jogo>(this.rota, jogo)
  }

  public favoritarJogo(id: number): Observable<Jogo>{
    return this.http.put<Jogo>(this.rota + "/favoritar/" + id, null);
  }
}
