import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccueilMjComponent } from './accueil-mj.component';

describe('AccueilMjComponent', () => {
  let component: AccueilMjComponent;
  let fixture: ComponentFixture<AccueilMjComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AccueilMjComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccueilMjComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
