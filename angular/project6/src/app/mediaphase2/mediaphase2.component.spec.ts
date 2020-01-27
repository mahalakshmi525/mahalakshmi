import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Mediaphase2Component } from './mediaphase2.component';

describe('Mediaphase2Component', () => {
  let component: Mediaphase2Component;
  let fixture: ComponentFixture<Mediaphase2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Mediaphase2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Mediaphase2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
