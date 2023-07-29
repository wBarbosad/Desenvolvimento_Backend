import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http"
import { Observable } from "rxjs";
import { Cosmetico } from "../models/cosmetico";

@Injectable({
  providedIn: 'root'
})

export class CosmeticoService{

  constructor(private http: HttpClient){

  }

  public listagemProduto(): Observable<Cosmetico[]>{
    return this.http.get<Cosmetico[]>("http://localhost:8080/cosmeticos")
  }

}

