import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonnageSpecialisationComponent } from './personnage-specialisation.component';

describe('PersonnageSpecialisationComponent', () => {
  let component: PersonnageSpecialisationComponent;
  let fixture: ComponentFixture<PersonnageSpecialisationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonnageSpecialisationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonnageSpecialisationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
