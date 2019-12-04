import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonnageMotivationComponent } from './personnage-motivation.component';

describe('PersonnageMotivationComponent', () => {
  let component: PersonnageMotivationComponent;
  let fixture: ComponentFixture<PersonnageMotivationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonnageMotivationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonnageMotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
