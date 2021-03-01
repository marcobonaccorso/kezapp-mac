import { Component } from '@angular/core';
import { Chat } from './chat';
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

  constructor() { }

  registrazione() {

  }

  inviaTutti() {

  }
  aggiorna() { }

  invia() { }

}
