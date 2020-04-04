import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchesHomeComponent } from './searches-home.component';

describe('SearchesHomeComponent', () => {
  let component: SearchesHomeComponent;
  let fixture: ComponentFixture<SearchesHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchesHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchesHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
