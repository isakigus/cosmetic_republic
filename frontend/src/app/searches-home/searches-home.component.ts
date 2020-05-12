import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-searches-home',
  templateUrl: './searches-home.component.html',
  styleUrls: ['./searches-home.component.scss']
})
export class SearchesHomeComponent implements OnInit {
  searchTextPlaceholder = "Empieza a buscar ;)"
  searchExplanation = ""
  searchValue = ""

  onSearch(value: String) {
    this.searchValue = '' + value
    this.findExplanation()
  }

  findExplanation() {
    let elements = this.searchValue.split(',')

    this.searchExplanation = `
    número de cosas = ${elements.length}
    <br/>
   `+ elements.map((item, i) => `<div> cosa #${i} > ${item}</div>`).join('')
  }

  constructor() { }

  ngOnInit(): void {
  }

}
