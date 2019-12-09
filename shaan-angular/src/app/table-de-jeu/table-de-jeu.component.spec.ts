import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TableDeJeuComponent } from './table-de-jeu.component';

describe('TableDeJeuComponent', () => {
  let component: TableDeJeuComponent;
  let fixture: ComponentFixture<TableDeJeuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TableDeJeuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TableDeJeuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
