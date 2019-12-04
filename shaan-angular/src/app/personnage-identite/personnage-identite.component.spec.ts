import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonnageIdentiteComponent } from './personnage-identite.component';

describe('PersonnageIdentiteComponent', () => {
  let component: PersonnageIdentiteComponent;
  let fixture: ComponentFixture<PersonnageIdentiteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonnageIdentiteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonnageIdentiteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
