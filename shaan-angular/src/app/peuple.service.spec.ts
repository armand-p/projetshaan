import { TestBed } from '@angular/core/testing';

import { PeupleService } from './service/peuple.service';

describe('PeupleService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PeupleService = TestBed.get(PeupleService);
    expect(service).toBeTruthy();
  });
});
