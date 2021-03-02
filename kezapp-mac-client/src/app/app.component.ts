import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Chat } from './chat';
import { Contatto } from './contatto';
import { Messaggio } from './messaggio';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nickname = "";
  messaggio = "";
  showTable: boolean = true;
  messaggi: Messaggio[] = [];
  contatti: Chat[] = [];
  //contatto= new Contatto();

  constructor(private http: HttpClient) { }

  registrazione() {
    //this.contatti.push(this.contatto);
    //this.contatti=[];

  }

  inviaTutti() {

  }
  aggiorna() { }

  invia() { }

}
