import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
  const { name, status, duration, trainer } = cohort;

  return (
    <div className={styles.box}>
      <h3 style={{ color: status === 'Ongoing' ? 'green' : 'blue' }}>{status}</h3>
      <dl>
        <dt>Name:</dt>
        <dd>{name}</dd>
        <dt>Duration:</dt>
        <dd>{duration}</dd>
        <dt>Trainer:</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;