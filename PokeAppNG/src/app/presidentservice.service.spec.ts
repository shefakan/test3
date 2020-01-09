import { TestBed } from '@angular/core/testing';

import { PresidentserviceService } from './presidentservice.service';

describe('PresidentserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PresidentserviceService = TestBed.get(PresidentserviceService);
    expect(service).toBeTruthy();
  });
});
