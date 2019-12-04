import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonnagePouvoirComponent } from './personnage-pouvoir.component';

describe('PersonnagePouvoirComponent', () => {
  let component: PersonnagePouvoirComponent;
  let fixture: ComponentFixture<PersonnagePouvoirComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonnagePouvoirComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonnagePouvoirComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
