import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonnageAcquisComponent } from './personnage-acquis.component';

describe('PersonnageAcquisComponent', () => {
  let component: PersonnageAcquisComponent;
  let fixture: ComponentFixture<PersonnageAcquisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonnageAcquisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonnageAcquisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
